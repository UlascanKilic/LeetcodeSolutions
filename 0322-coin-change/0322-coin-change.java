class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] ways = new int[amount + 1];

        ways[0] = 0;

        for(int i = 1; i < ways.length; i++)
        {
            ways[i] = Integer.MAX_VALUE;
            for(int j = 0; j < coins.length; j++)
            {
                if(coins[j] <= i && ways[i - coins[j]] != Integer.MAX_VALUE)
                {
                    if(ways[i] == -1)
                        ways[i] = 1 + ways[i - coins[j]];
                    else
                        ways[i] = Math.min((ways[i]), 1 + ways[i - coins[j]]);
                }
            }
        }

        return  ways[amount] == Integer.MAX_VALUE ? -1 : ways[amount];
    }
}