import java.util.ArrayList;
import java.util.List;

public class MultipleArray {
    private static class MultipleArrayProperty {
        public final Class<?> classCast;
        public final Object object;

        public MultipleArrayProperty(Object object) {
            this.classCast = object.getClass();
            this.object = object;
        }

        public Object cast() {
            return classCast.cast(object);
        }
    }

    List<MultipleArrayProperty> properties = new ArrayList<>();

    public List<MultipleArrayProperty> getProperties() {
        return properties;
    }

    private MultipleArrayProperty getArrayByObject(Object object) {
        int index = -1;
        for (int i = 0; i < properties.size(); i++) if (properties.get(i).object == object) index = i;
        if (index == -1) throw new IllegalArgumentException("Object not found");
        return properties.get(index);
    }

    public Object get(int index) {
        return getProperties().get(index).cast();
    }

    public Object[] all() {
        Object[] result = new Object[properties.size()];
        for (int i = 0; i < result.length; i++) result[i] = properties.get(i).cast();
        return result;
    }

    public List<Object> allAsList() {
        List<Object> result = new ArrayList<>();
        for (MultipleArrayProperty property : properties) result.add(property.cast());
        return result;
    }

    public void add(Object obj) {
        properties.add(new MultipleArrayProperty(obj));
    }

    public void remove(Object obj) {
        properties.remove(getArrayByObject(obj));
    }
}