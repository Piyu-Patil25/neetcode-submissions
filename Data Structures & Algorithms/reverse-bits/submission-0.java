class Solution {
    public int reverseBits(int n) {
       int res = 0;  // Result will store the reversed bits
        for (int i = 0; i < 32; i++) {
            // Shift result left to make space for the next bit
            res <<= 1;
            // Add the least significant bit of n to the result
            res = res + (n & 1); 
            // Right shift n to process the next bit
            n >>= 1;
        }
        return res;  // Return the result with the bits reversed 
    }
}
