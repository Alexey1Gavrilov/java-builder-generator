package buildit;

import java.net.URI;

/**
 * Created by agavrilov on 24/11/14.
 */
public class Example {
    public static void main(String[] args) {
        final Foo foo = new FooBuilder()
                .number(123)
                .string("")
                .uri(URI.create(""))
                .build();

        final Foo foo2 = new FooBuilder(foo)
                .string("abc")
                .build();

        System.out.println(foo + " " + foo2);
    }
}
