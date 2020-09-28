package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content {
	public  static final int LONG_PLAYING_TIME = 2 * 60 + 15;

	private String director;
	private LocalDate releaseDate;
	private int duration;

	public Movie(String title, Rating maturityRating) {
		super(title, maturityRating);
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = Math.abs(duration);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		if (releaseDate != null) {
			builder.append(" (").append(releaseDate.getYear()).append(")");
		}
		return builder.toString();
	}
}
