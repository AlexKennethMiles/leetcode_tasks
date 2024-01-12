package math.my;

public class DistributionOptimizer {

    public static void main(String[] args) {
        int[][] marketData = {
                {200, 5, 10},
                {150, 4, 9},
                {100, 6, 12},
                {120, 3, 8}
        };

        optimizeDistribution(marketData);
    }

    public static void optimizeDistribution(int[][] marketData) {
        int numMarkets = marketData.length;

        int[] bestDistribution = new int[numMarkets];
        int maxProfit = 0;

        for (int i = 0; i <= marketData[0][0]; i++) {
            for (int j = 0; j <= marketData[1][0]; j++) {
                for (int k = 0; k <= marketData[2][0]; k++) {
                    for (int l = 0; l <= marketData[3][0]; l++) {
                        int totalDemand = i + j + k + l;
                        if (totalDemand <= marketData[0][0]) {
                            int profit = calculateProfit(i, j, k, l, marketData);
                            if (profit > maxProfit) {
                                maxProfit = profit;
                                bestDistribution[0] = i;
                                bestDistribution[1] = j;
                                bestDistribution[2] = k;
                                bestDistribution[3] = l;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Best Distribution:");
        for (int i = 0; i < numMarkets; i++) {
            System.out.println("Market " + (char) ('A' + i) + ": " + bestDistribution[i]);
        }
        System.out.println("Maximum Profit: $" + maxProfit);
    }

    private static int calculateProfit(int a, int b, int c, int d, int[][] marketData) {
        int totalProfit = 0;
        for (int i = 0; i < marketData.length; i++) {
            int demand = marketData[i][0];
            int productionCost = marketData[i][1];
            int sellingPrice = marketData[i][2];
            int distribution = (i == 0) ? a : (i == 1) ? b : (i == 2) ? c : d;
            totalProfit += (sellingPrice - productionCost) * Math.min(demand, distribution);
        }
        return totalProfit;
    }
}
