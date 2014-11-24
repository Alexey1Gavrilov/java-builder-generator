package buildit;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;

/**
 * Created by agavrilov on 24/11/14.
 */
@Generated("")
public class FooBuilder {
    private List<String> list;
    private int number;
    private String string;
    private URI uri;

    // Add special annotation that will be recognized by module
    private static class FooImpl extends Foo {
        private final int number;
        private final String string;
        private final URI uri;
        private final List<String> list;

        // @JsonCreator
        private FooImpl(
                final int number,
                final String string,
                final URI uri,
                final List<String> list) {
            super(number, string, uri);
            this.number = number;
            this.string = string;
            this.uri = uri;
            this.list = list;
        }

        @Override
        public int number() {
            return number;
        }

        @Override
        public String string() {
            return string;
        }

        @Override
        public URI uri() {
            return uri;
        }

        @Override
        public List<String> list() { return list; }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Foo{");
            sb.append("number=").append(number);
            sb.append(", string='").append(string).append('\'');
            sb.append(", uri=").append(uri);
            sb.append('}');
            return sb.toString();
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            final FooImpl foo = (FooImpl) o;

            if (number != foo.number) return false;
            if (list != null ? !list.equals(foo.list) : foo.list != null) return false;
            if (string != null ? !string.equals(foo.string) : foo.string != null) return false;
            if (uri != null ? !uri.equals(foo.uri) : foo.uri != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = number;
            result = 31 * result + (string != null ? string.hashCode() : 0);
            result = 31 * result + (uri != null ? uri.hashCode() : 0);
            result = 31 * result + (list != null ? list.hashCode() : 0);
            return result;
        }
    }

    public FooBuilder() {

    }

    public FooBuilder(final Foo from) {
        number = from.number();
        string = from.string();
        uri = from.uri();
        list = from.list();
    }

    public FooBuilder number(int number) {
        this.number = number;
        return this;
    }

    public FooBuilder string(String string) {
        this.string = string;
        return this;
    }

    public FooBuilder uri(URI uri) {
        this.uri = uri;
        return this;
    }

    public FooBuilder list(List<String> list) {
        this.list = list;
        return this;
    }

    public Foo build() {
        return new FooImpl(number, string, uri, list);
    }
}
