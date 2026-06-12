class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        int n = start.length;
        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0;
        int rooms = 0, maxRooms = 0;

        while (i < n) {
            if (start[i] < end[j]) {
                rooms++;
                i++;
            } else {
                rooms--;
                j++;
            }
            maxRooms = Math.max(maxRooms, rooms);
        }

        return maxRooms;
    }
}