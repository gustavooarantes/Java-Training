package chapterone.exercises;

public class Exercises {
    public static void main(String[] args) {
        // 1.2.1
        // Assigns a to t -> assigns t to b -> assigns b to a -> all values have a's value (a doesn't change).

        // 1.2.2
        double sine = Math.sin(19.0);
        double cosine = Math.cos(19.0);
        double equation = (sine * sine) + (cosine * cosine);
        System.out.println("1.2.2 - " + equation);
        // Operations like Math.sin() and Math.cos() use approximations (Taylor series, CORDIC, etc.),
        // which may not be exactly correct.

        // 1.2.3
        // See Obsidian drawing.
        boolean randomValueOne = (Math.random() < 0.5) ? false : true;
        boolean randomValueTwo = (Math.random() < 0.5) ? false : true;
        boolean expressionToEvaluate = (!(randomValueOne && randomValueTwo) && (randomValueOne || randomValueTwo)) || ((randomValueOne && randomValueTwo) || !(randomValueOne || randomValueTwo));
        System.out.println("1.2.3 - " + expressionToEvaluate);
    }
}
