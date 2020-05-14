import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BookStore{


        private String name;
        private String address;
        private int sqFt;
        private boolean hasUsedBooks;
        private static final LocalTime Open = LocalTime.of(8, 00, 00);
        private static final LocalTime Close = LocalTime.of(18, 00, 00);
        private ArrayList<String> titles;

        // public BookStore(){
        //     setName(setAddress(address));
        //     setSqFt(3500);
        //     setHasUsedBooks(hasUsedBooks);
        // }
        public BookStore(String name, String address, int sqFt, boolean hasUsedBooks){
            this.setName(name);
            this.setAddress(address);
            this.setSqFt(sqFt);
            this.setHasUsedBooks(hasUsedBooks);
            titles = new ArrayList<String>();
            loadTitles();
            setTitles(titles);
        }
      
        private void setTitles(ArrayList<String> titles2) {
        }
        private void loadTitles() {
        }

        public boolean isHasUsedBooks() {
            return hasUsedBooks;
        }
        public boolean setHasUsedBooks(boolean isHasUsedBooks) {
            this.hasUsedBooks = isHasUsedBooks;
            return isHasUsedBooks;
        }
        public int getSqFt(){
            return sqFt;
        }
        public void setSqFt(int sqFt){
            this.sqFt = sqFt;
        }
        public String getClose(){
            return Close.format(DateTimeFormatter.ofPattern("hh:mm a"));
        }
        public String getOpen(){
            return Open.format(DateTimeFormatter.ofPattern("hh:mm a"));
        }
        public String getAddress(){
            return address;
        }
        public String setAddress(String address){
            this.address = address;
            return address;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }    





}
