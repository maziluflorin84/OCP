package introduction;

public class Test {
	public static void main(String[] args) {
		final int score1 = 8, score2 = 3;
		Integer myScore = 7;
		var goal = switch (myScore) {
			case score1, score2, 7 -> "good";
			case Integer i when i < 10 -> "better";
			case Integer i when i >= 10 -> "best";
			default -> { yield "unknown";}
			// case null -> "nope";
		};
		System.out.print(goal);
	}
}