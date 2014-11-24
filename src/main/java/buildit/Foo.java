package buildit;

import java.net.URI;
import java.util.List;

/**
 * Created by agavrilov on 24/11/14.
 */
@GenerateBuilder
public abstract class Foo {
    public abstract int number();
    public abstract String string();
    public abstract URI uri();
    public abstract List<String> list();

    protected Foo(final int number, final String string, final URI uri) {
        // validate input
        System.out.println(number + " " + string + " " + uri);
        if (number == 123) {
            throw new IllegalArgumentException("!");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Foo{");
        sb.append('}');
        return sb.toString();
    }


}
