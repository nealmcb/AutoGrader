package ie.ucd.autograder.views;

import net.sourceforge.nattable.data.IDataProvider;

public class AutoGraderBodyDataProvider implements IDataProvider {

  private final AutoGraderDataProvider dataProvider;
  
  public AutoGraderBodyDataProvider(AutoGraderDataProvider dataProvider) {
    this.dataProvider = dataProvider;
  }

  public int getColumnCount() {
//    Log.info("Body column count: " + dataProvider.getColumnCount());
    return dataProvider.getColumnCount();
  }

  public Object getDataValue(int columnIndex, int rowIndex) {
//    Log.info("Getting body value for col=" + columnIndex + ", row=" + rowIndex);
    return dataProvider.getBodyDataValue(rowIndex, columnIndex);
  }

  public int getRowCount() {
//    Log.info("Body row count: " + dataProvider.getBodyRowCount());
    return dataProvider.getBodyRowCount();
  }

  public void setDataValue(int columnIndex, int rowIndex, Object newValue) {
    throw new UnsupportedOperationException();
  }

}
