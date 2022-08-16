import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Two Sum
        Leet l = new Leet();
        l.twoSum(new int[]{3, 2, 3}, 6);
        //--------------------------------------------

        //Palindrome
        Palindrome s = new Palindrome();
        s.isPalindrome(1000021);
        //--------------------------------------------

        //Parentheses
        Parentheses p = new Parentheses();
        p.isValid("([}}])");
        //--------------------------------------------

        //MergeLists
        MergeLists m = new MergeLists();
        ListNode list1 = new ListNode();
        list1.val = 1;
        list1.next = new ListNode(2, new ListNode(4));
        ListNode list2 = new ListNode();
        list2.val = 1;
        list2.next = new ListNode(3, new ListNode(4));
        m.mergeTwoLists(list1, list2);
        //--------------------------------------------

        //DuplicatesList
        DuplicatesList d = new DuplicatesList();
        ListNode head = new ListNode();
//        head.val = 1;
//        head.next = new ListNode(1, new ListNode(2));
        d.deleteDuplicates(head);
        //--------------------------------------------

        //MajorityElement
        MajorityElement me = new MajorityElement();
        me.majorityElement(new int[] {2,2,1,3,1,1,4,1,1,5,1,1,6});
        //--------------------------------------------

        //StrongPw
        StrongPw sp = new StrongPw();
        sp.strongPasswordCheckerII("IloveLe3tcode!");
        //--------------------------------------------

        //FirstnLast (Medium)
        FirstnLast f = new FirstnLast();
        f.searchRange(new int[] {}, -1);
        //--------------------------------------------

        //LastWord
        LastWord lw = new LastWord();
        lw.lengthOfLastWord("   fly me   to   the moon  ");
        //--------------------------------------------

        //MissingP (Hard)
        MissingP pp = new MissingP();
        pp.firstMissingPositive(new int[] {1,2,0});
        //--------------------------------------------

        //Stock
        Stock stock = new Stock();
        stock.maxProfit(new int[] {2,4,1});
        //--------------------------------------------

        //ReverseLS
        ReverseLS ls = new ReverseLS();
        head.val = 1;
        head.next = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))));
        ls.reverseList(head);
        //--------------------------------------------

        //InvertBinaryTree
        InvertBinaryTree bin = new InvertBinaryTree();
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        bin.invertTree(root);
        //--------------------------------------------

        StoneWeight sw = new StoneWeight();
        sw.lastStoneWeight(new int[] {2,7,4,1,8,1});
        //--------------------------------------------

        TwoSumII ts = new TwoSumII();
        ts.twoSum(new int[] {1,3,4,5,7,11}, 9);

    }
}
