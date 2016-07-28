package sst.common.html.table.builders;

@FunctionalInterface
public interface IntoTableConverter {

    public CellInfo[] convert();
}
