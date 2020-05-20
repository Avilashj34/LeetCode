Input: ["StockSpanner","next","next","next","next","next","next","next"], [[],[100],[80],[60],[70],[60],[75],[85]]
Output: [null,1,1,1,2,1,4,6]
Explanation: 
First, S = StockSpanner() is initialized.  Then:
S.next(100) is called and returns 1,
S.next(80) is called and returns 1,
S.next(60) is called and returns 1,
S.next(70) is called and returns 2,
S.next(60) is called and returns 1,
S.next(75) is called and returns 4,
S.next(85) is called and returns 6.

Note that (for example) S.next(75) returned 4, because the last 4 prices
(including today's price of 75) were less than or equal to today's price.



Solution :
class StockSpanner {
    List<Integer> l = null;
    public StockSpanner() {
        l= new ArrayList<Integer>();
    }
    
    public int next(int price) {
        int count = 1;
        l.add(price);
        for(int i = l.size()-1;i>0;i--){
            //System.out.println(l.get(i));
            if(price >= l.get(i-1)){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */