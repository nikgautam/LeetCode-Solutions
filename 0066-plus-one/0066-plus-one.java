class Solution {
    public int[] plusOne(int[] digits) {
        Stack<Integer> st = new Stack<>();
        int carry = 1, n = digits.length;
        
        for( int i=n-1; i>=0; i-- ){
            int sum = digits[i] + carry;
            st.push(sum%10);
            carry = sum/10;
        }
        
        if( carry != 0 )
            st.push(carry);
        
        int[] arr = new int[st.size()];
        int i = 0;
        while( !st.empty() ){
            arr[i++] = st.pop();
        }
        
        return arr;
            
    }
}