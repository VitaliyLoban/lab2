package by.belstu.it.loban.basejava;

import java.util.Objects;

public class WrapperString {
    private String str;

    public WrapperString(String str) {
        this.str = str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "str='" + str + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(str, that.str);
    }

    @Override
    public int hashCode() {

        return Objects.hash(str);
    }

    public String getStr() {

        return str;
    }
     class Wrsa {
        public void replace(char oldchar, char newchar) {
            System.out.println("replace");
        }

         class Wrs extends Wrsa{
            @Override
            public void replace(char oldchar, char newchar)
            {
                System.out.println("override");
            }
            public void delete(char newchar){
                System.out.println("delete");
            }

        }
    }

    public void main(String[] args) {
        Wrsa kkk=new Wrsa();
        kkk.replace('e','e');
        Wrsa.Wrs ikk=new Wrsa().new Wrs();
        ikk.replace('q','q');
        ikk.delete('r');
    }
}
/**
 * @author Vitaliy
 * @version 1.0.
 *
 */