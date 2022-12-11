import java.util.ArrayList;
import java.util.List;

public class Parachute {

    public void parachutePrint(int i) {
        int guess = i;
        if (guess == 7) {
            String[] parachute = {
                    "  ___",
                    " /___\\",
                    " \\   /",
                    "  \\ /",
                    "   O",
                    "  /|\\",
                    "  / \\"
            };
            int j = 0;
            for (String value: parachute) {
                if (j < parachute.length-1) {
                    System.out.println(value);
                } else {
                    System.out.println(value);
                }
            }
        }
        if (guess == 6) {
            String[] parachute = {
                    " /___\\",
                    " \\   /",
                    "  \\ /",
                    "   O",
                    "  /|\\",
                    "  / \\"
            };
            int j = 0;
            for (String value: parachute) {
                if (j < parachute.length-1) {
                    System.out.println(value);
                } else {
                    System.out.println(value);
                }
            }
        }
        else if (guess == 5) {
            String[] parachute = {
                    " \\   /",
                    "  \\ /",
                    "   O",
                    "  /|\\",
                    "  / \\" };
            int j = 0;
            for (String value: parachute) {
                if (j < parachute.length-1) {
                    System.out.println(value);
                } else {
                    System.out.println(value);
                }
            }
        }
        else if (guess == 4) {
            String[] parachute = {
                    "  \\ /",
                    "   O",
                    "  /|\\",
                    "  / \\" };
            int j = 0;
            for (String value: parachute) {
                if (j < parachute.length-1) {
                    System.out.println(value);
                } else {
                    System.out.println(value);
                }
            }
        }
        else if (guess == 3) {
            String[] parachute = {
                    "   O",
                    "  /|\\",
                    "  / \\"};
            int j = 0;
            for (String value: parachute) {
                if (j < parachute.length-1) {
                    System.out.println(value);
                } else {
                    System.out.println(value);
                }
            }
        }
        else if (guess == 2) {
            String[] parachute = {
                    "  /|\\",
                    "  / \\"};
            int j = 0;
            for (String value: parachute) {
                if (j < parachute.length-1) {
                    System.out.println(value);
                } else {
                    System.out.println(value);
                }
            }
        }
        else if (guess == 1) {
            String[] parachute = {
                    "  /|\\",
                    "  / \\"};
            int j = 0;
            for (String value: parachute) {
                if (j < parachute.length-1) {
                    System.out.println(value);
                } else {
                    System.out.println(value);
                }
            }
        }

    }
}
