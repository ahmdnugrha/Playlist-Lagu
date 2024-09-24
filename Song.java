package PM2;

class Song {
    String title;
    Song next;

    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}

class Playlist {
    private Song head;

    public Playlist() {
        this.head = null;
    }

    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }

    public void displayPlaylist() {
        Song current = head;
        if (current == null) {
            System.out.println("Playlist kosong.");
            return;
        }
        System.out.println("Daftar Lagu di Playlist:");
        while (current != null) {
            System.out.println("- " + current.title);
            current = current.next;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("anjay");
        playlist.addSong("babahayo da");
        playlist.addSong("slebew");

        playlist.displayPlaylist();
    }
}

