//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public  int countValidSelections(int[] nums) {
        int n = nums.length;
        int count = 0;
        int lastZeroIndex = -1;
        int direction = 1; // 1 for right, -1 for left

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (lastZeroIndex == -1 || Math.abs(i - lastZeroIndex) >= 2) {
                    int j = i + direction;
                    while (0 <= j && j < n && nums[j] > 0) {
                        j += direction;
                    }
                    if (0 <= j && j < n && (j == n - 1 || nums[j] == 0)) {
                        count++;
                    }
                }
                lastZeroIndex = i;
                direction = -direction;
            }
        }

        return count;
    }


}