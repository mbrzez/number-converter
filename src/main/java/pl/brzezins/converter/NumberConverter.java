package pl.brzezins.converter;

public interface NumberConverter<T, V> {
    public T convert(V number);
}
