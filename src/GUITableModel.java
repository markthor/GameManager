
import javax.swing.table.AbstractTableModel;


public class GUITableModel extends AbstractTableModel {
	
	private Object[][] data;
	
	private String[] columnNames;
	
	public GUITableModel(String[] columnNames, Object[][] data)
	{
		this.columnNames = columnNames;
		this.data = data;
	}
	
	public int getRowCount()
	{
		return data.length;
	}
	public int getColumnCount()
	{
		return columnNames.length;
	}
	public String getColumnName(int col)
	{
		return columnNames[col];
	}
	public Object getValueAt(int row, int col)
	{
		return data[row][col];
	}
	public boolean isCellEditable(int row, int col)
	{ 
		return false; 
	}
	public void updateTable(Object[][] updateData)
	{
		if(updateData == null)
		{
			System.out.println();
		}
		data = updateData;
		fireTableDataChanged();
	}
	
	public void clearTable()
	{
		data = new Object[][]{{"Search for vehicles", null, null}};
		fireTableDataChanged();
	}
}
