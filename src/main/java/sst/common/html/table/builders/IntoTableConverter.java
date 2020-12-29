package sst.common.html.table.builders;

@FunctionalInterface
public interface IntoTableConverter {

    CellInfo[] convert();
}
