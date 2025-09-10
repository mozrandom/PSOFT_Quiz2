/**
 * CollaborativeEdit.java
 *
 * A tiny Java program designed for a Git/GitHub collaboration exercise.
 * It prints a greeting and a short checklist, then exits.
 *
 * HOW TO USE FOR THE ASSIGNMENT
 *  - Step (4): You make one change in the TEAM_EDIT_REGION below (e.g., add your name).
 *  - Step (5): Your friend makes a *different* change in the same lines (e.g., add their name or change the wording).
 *  - Steps (6)–(9): When you both push/pull, you'll get a merge conflict in this file.
 *    Resolve it by keeping both contributions, then commit the resolution.
 *
 * Tips:
 *  - Keep edits inside TEAM_EDIT_REGION to guarantee a conflict.
 *  - Avoid changing the class name or method signatures so the file still compiles.
 */
public class CollaborativeEdit {

    // Simple “version” string to show whose edit is present
    private static final String VERSION = "v1.0";

    public static void main(String[] args) {
        System.out.println("=== Collaborative Edit Demo (" + VERSION + ") ===");
        System.out.println();
        printChecklist();
        System.out.println();
        System.out.println("Team message:");
        System.out.println(teamMessage());  // <- This returns text from the TEAM_EDIT_REGION
        System.out.println();
        System.out.println("Sum(2, 3) = " + computeSum(2, 3)); // trivial method to keep the file non-trivial
    }

    /** Prints the assignment checklist to the console (for screenshots). */
    private static void printChecklist() {
        String[] steps = {
            "1) Create a public repo on GitHub and add this Java file.",
            "2) Clone the repo locally; commit and push a change.",
            "3) Add a collaborator; have them clone the repo.",
            "4) EACH person edits the SAME lines below (TEAM_EDIT_REGION).",
            "5) Try pushing; observe the push/pull behavior and conflicts.",
            "6) Resolve the merge conflict; keep both contributions.",
            "7) Verify both machines are in the same state; take screenshots."
        };
        for (String s : steps) System.out.println(" - " + s);
    }

    /** A tiny pure function so we can compile/run something meaningful. */
    public static int computeSum(int a, int b) {
        return a + b;
    }

    // ---------------------------------------------------------------------
    // ----------------------  TEAM_EDIT_REGION (START)  --------------------
    // Edit ONLY the lines inside teamMessage(); both collaborators should
    // make different edits here to force a merge conflict in step (5).
    // Examples of different edits:
    //   - Change the names or add your own contact handle.
    //   - Change the emoji or punctuation.
    //   - Add/remove a line from the message.
    // ---------------------------------------------------------------------
    private static String teamMessage() {
        // TODO (You): Replace the placeholder name with YOUR name and a short note.
        // TODO (Friend): Replace the placeholder name with YOUR name and a different note.
        // Make sure you *both* edit at least one of the SAME lines below.

        String line1 = "Hello from Solomon! ✨";   // <-- both of you edit this line differently
        String line2 = "And hello from <Friend Name Here>! 🚀"; // <-- and/or this one
        String line3 = "We are testing Git merges and conflict resolution.";

        // You can also add or remove a line to increase the chance of conflict:
        // String extra = "Optional extra line edited by one collaborator.";

        return String.join("\n", line1, line2, line3);
    }
    // -----------------------  TEAM_EDIT_REGION (END)  ---------------------
    // ---------------------------------------------------------------------
}
