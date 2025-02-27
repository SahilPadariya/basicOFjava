package OOPs;

public class FiveStarMovie {
    public static void main(String[] args) {
        Movie[] arr = {
                new Movie("BAHUBALI", "RAJ HANSH", "4 STAR"),
                new Movie("STREE2", "YASH RAJ"),
                new Movie("SANAM TERI KASASM", "VELENTIAN"),
                new Movie("PUSPA", "PONIX", "3 STAR"),
                new Movie("HARRY POTTER", "WARNER BROS", "5 STAR"),
                new Movie("KGF 2", "PANORAMA"),
                new Movie("SHAITAN", "PVR", "4.5 STAR"),
                new Movie("PATHAAN", "MULTIMEDIA"),
                new Movie("HIMMATWALA", "DHARMA PRODUCTION"),
                new Movie("SITA RAM", "PVR", "3 STAR")
        };
        Movie arr3[] = Get5StarMoive(arr);
        display5StarMovie(arr3);
    }

    public static void display5StarMovie(Movie[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i].display();
        }
    }
    public static Movie[] Get5StarMoive(Movie[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].get5starmovie().equals("5 STAR")) {
                c++;
            }
        }
        Movie arr2[] = new Movie[c];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j].get5starmovie().equals("5 STAR")) {
                arr2[arr2.length - c] = arr[j];
                c--;
            }
        }
        return arr2;
    }
}
class Movie{
    private String title;
    private String studio;
    private String rating;

    Movie(String title,String studio,String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie(String title,String studio){
        this.title=title;
        this.studio=studio;
        this.rating="5 STAR";
    }

    public String get5starmovie(){

        return rating;
    }
    public void display(){

        System.out.println(this.title);
    }
}
