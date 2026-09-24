int maxProfit(int* prices, int pricesSize) {
    int profit=0;
    int minprices=prices[0];
    for(int i=0;i<pricesSize;i++)
    {
            if(prices[i]<minprices) 
               minprices=prices[i];
            if(prices[i]-minprices>profit) 
              profit=prices[i]-minprices;
         }
        return profit;
    }
