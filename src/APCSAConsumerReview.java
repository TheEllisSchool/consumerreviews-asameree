
public class APCSAConsumerReview {

	public static void main(String[] args) {
		/*
		double value = Review.sentimentVal("absurd");
		System.out.println(value);
		
		double total = Review.totalSentiment("src/SimpleReview.txt");
		System.out.println("Total Sentiment: " + total);
		
		double rating = Review.starRating("src/SimpleReview.txt");
		*/
		String fake = Review.fakeReview("src\\SimpleReview.txt");
		System.out.println(fake);

	}

}
