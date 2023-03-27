package VII_ObjectAndClasses.T22_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*4.	Songs
Define a class Song,
which holds the following information about songs:
Type List, Name, and Time.
On the first line, you will receive the number of songs - N.
On the next N-lines, you will be receiving data in the following format: "{typeList}_{name}_{time}".
On the last line, you will receive "Type List" / "all". Print only the names of the songs which are from that Type List / All songs.
*/

public class Songs {
    //create private class
    static class Song {
        public Song() {
        }

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        private String typeList;
        private String name;
        private String time;

        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static void main(String[] args) {
        //create scanner
        Scanner sc = new Scanner(System.in);
        //get iterations
        int count = Integer.parseInt(sc.nextLine());
        //get songList
        List<Song> list = new ArrayList<>();
        //foreach iteration
        for (int i = 0; i < count; i++) {
            //get song data
            String input = sc.nextLine();
            //invoke create song from data
            Song song = getSong(input);
            //add it to list
            list.add(song);
        }
        //get the requested type
        String type = sc.nextLine();
        //print
        if (type.equals("all")) {
            for (Song song : list) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : list) {
                if (song.getTypeList().equals(type))
                    System.out.println(song.getName());
            }
        }
        sc.close();
    }

    //method to get the song from data
    private static Song getSong(String input) {
        String data[] = input.split("_");
        return new Song(data[0], data[1], data[2]);
    }

}
