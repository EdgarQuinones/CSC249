package project1;

public class Song {

	// private instance variables
	private String name, artist, album;
	private int length;
	protected Song nextSong;
	private Song previousSong;

	// no-arg constructor
	Song() {
		name = "";
		artist = "";
		album = "";
		length = 0;
		nextSong = null;
		previousSong = null;
	}

	// constructor
	Song(String name, String artist, String album, int length, Song nextSong, Song previousSong) {
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.length = length;
		this.nextSong = nextSong;
		this.previousSong = previousSong;
	}

	// setters and getters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Song getNextSong() {
		return nextSong;
	}

	public void setNextSong(Song nextSong) {
		this.nextSong = nextSong;
	}

	public Song getPreviousSong() {
		return previousSong;
	}

	public void setPreviousSong(Song previousSong) {
		this.previousSong = previousSong;
	}

}
