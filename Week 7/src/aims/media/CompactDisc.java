package aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
  private String artist;
  private int length;
  private ArrayList<Track> tracks = new ArrayList<Track>();

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public void addTrack(Track track) {
    if (tracks.contains(track)) {
      System.out.println("Track is already in the list of tracks!");
      return;
    }
    tracks.add(track);
    System.out.println("Add track success!");
  }

  public void removeTrack(Track track) {
    if (tracks.remove(track)) {
      System.out.println("Remove track success!");
      return;
    }
    System.out.println("Track is not in the list of tracks!");
  }

  public int getLength() {
    int length = 0;
    for (int i = 0; i < tracks.size(); i++) {
      length += tracks.get(i).getLength();
    }
    return length;
  }

  @Override
  public void play() {
    System.out.println("Playing " + this.getArtist() + "'s disc");
    for (int i = 0; i < tracks.size(); i++) {
      tracks.get(i).play();
    }
  }
}
