import java.util.PriorityQueue;

public class StoneWeight {
    /*
    You are given an array of integers stones where stones[i] is the weight of the ith stone.
    We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together.
    Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
        If x == y, both stones are destroyed, and
        If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
        At the end of the game, there is at most one stone left.
        Return the weight of the last remaining stone. If there are no stones left, return 0.
    Source: https://leetcode.com/problems/last-stone-weight/
     */

    public int lastStoneWeight(int[] stones) {
        /*
        each element has a certain priority, which determine the order in which elements are removed from que
        only supports comparable data
        min heap: top to bottom left to right; children has to be greater or equal to his parent
        max heap: to get the max values of the array
         */
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int stone : stones) heap.add(-1 * stone); //-1 to get a max heap, later convert it back
        while (heap.size() > 1) {
            int y = heap.remove();
            int x = heap.remove();
            if(x != y) heap.add(y - x);
        }
        if(heap.size() != 0) return -1 * heap.remove();
            else return 0;
    }

}
