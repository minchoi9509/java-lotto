package step2.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LottoTotalCalculator {
    private Map<WinnerTier, Integer> winningResult = new HashMap<>();

    public Map<WinnerTier, Integer> countWinners(LottoGame lottoGame, Lotto WinnerLotto) {

        for (WinnerTier winnerTier : WinnerTier.values()) {
            long matchCount = lottoGame.getLottos().stream()
                    .filter(lotto -> lotto.checkWinningCount(WinnerLotto) == winnerTier.getMatchCnt())
                    .count();

            winningResult.put(winnerTier, (int) matchCount);
        }

        return winningResult;
    }

    public double returnYield(int lottoMoney) {
        double sum = 0;

        for (WinnerTier winnerTier : WinnerTier.values()) {
            sum += winnerTier.getPrize() * winningResult.get(winnerTier);
        }

        return Math.floor(sum / lottoMoney * 100) / 100;
    }
}
