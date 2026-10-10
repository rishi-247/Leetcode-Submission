class Solution { 
    public boolean checkPerfectNumber(int num) { 
        int digit = 0, sum = 0; 
        
        for(int i = 1; i * i <= num; i++) { 
            if(num % i == 0 && num != 1) { 
                digit = num / i; 
                
                if(digit != i && digit != num) {
                    sum = digit + i + sum; 
                }
                else {
                    sum = sum + i; 
                }
            }
        }
        
        return (sum == num); 
    } 
}