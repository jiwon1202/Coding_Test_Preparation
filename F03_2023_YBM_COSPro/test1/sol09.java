package test1;

class sol09 {
    public String func_a(String str, int len){
        String padZero = "";
        int padSize = len - str.length();
        for(int i = 0; i < padSize; i++)
            padZero += "0";
        return padZero + str;
    }
    
    public int solution(String binaryA, String binaryB) {
        int maxLength = Math.max(binaryA.length(), binaryB.length());
        binaryA = func_a(binaryA, maxLength);
        binaryB = func_a(binaryB, maxLength);
        
        int hammingDistance = 0;
        for(int i = 0; i < maxLength; i++)
            if(binaryA.charAt(i) != binaryB.charAt(i))
                hammingDistance += 1;
        return hammingDistance;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
    	sol09 sol = new sol09();
        String binaryA = "10111110";
        String binaryB = "0110110";
        int ret = sol.solution(binaryA, binaryB);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}