class Solution {

    private String encode(List<String> input) {
        StringBuilder encoded = new StringBuilder();

        // Loop through each string in the list
        for (String str : input) {
            // Append the length of the string, the delimiter '#', and the string itself
            encoded.append(str.length()).append("#").append(str);
        }

        return encoded.toString();
    }

    private List<String> decode(String encoded) {
        List<String> decoded = new ArrayList<>(); // List to store the decoded strings
        int i = 0; // Index to track the current position in the encoded string


        // Loop until the end of the encoded string
        while (i < encoded.length()) {
            // Find the position of the delimiter '#'
            int delimiterIndex = encoded.indexOf("#", i);

            // Extract the length of the string as an integer
            int length = Integer.parseInt(encoded.substring(i, delimiterIndex));

            // Extract the string using the length and add it to the decoded list
            String str = encoded.substring(delimiterIndex + 1, delimiterIndex + 1 + length);
            decoded.add(str);

            // Move the index to the start of the next encoded segment
            i = delimiterIndex + 1 + length;
        }

        // Return the list of decoded strings
        return decoded;
    }
}
