    package Parqueadero;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ModeloParking extends AbstractTableModel{
    
    private final   List<Parking> parkings;

    public ModeloParking() {
        this.parkings = new ArrayList<>();
    }
 
    @Override
    public int getRowCount() {
        return parkings.size();   
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int colIndex) {
        Parking aux = parkings.get(rowIndex);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        switch (colIndex) {
            case 0:
                return aux.getTarifa();
            case 1:
                return aux.getNombre();
            case 2:
                return aux.getVehiculo();
            case 3:
                return aux.getPlaca();
            case 4:
                return formato.format(aux.getFechaIngreso());
            default:
                if(aux.getFechaSalida()== null){
                    return"No ha salido";
                }else{
                    return formato.format(aux.getFechaSalida());  
                }   
        }
    }
        @Override
    public String getColumnName(int column) {

        switch (column) {
            case 0:
                return "Tarifa";
            case 1:
                return "Propietario";
            case 2:
                return "Vehiculo";
            case 3:
                return "Placa";
            case 4:
                return "Entrada";                
            default:
                return "Salida";   
        }
    }
        @Override
    public Class<?> getColumnClass(int columnIndex) {
        return getValueAt(0, columnIndex).getClass();
    }
        @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Parking aux = parkings.get(rowIndex);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        switch (columnIndex) {
            case 0:
                aux.setTarifa((String) aValue);
                break;
            case 1:
                aux.setNombre((String) aValue);
                break;
            case 2:
                aux.setVehiculo((String) aValue);
                break;
            case 3:
                aux.setPlaca((String) aValue);
                break;
            case 4:
                try {
                    Date fecha = formato.parse((String) aValue);
                    aux.fechaIngreso(fecha);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    Date fecha = formato.parse((String) aValue);
                    aux.fechaSalida(fecha);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return !(columnIndex == 4 || columnIndex == 5);
    }
    public List<Parking> getParkings() {
        return parkings;
    }
    
    void addDatos(Parking e) {
        parkings.add(e);
        fireTableDataChanged();
    }
   
    void removeDatos(int selectedRow) {
        parkings.remove(selectedRow);
        fireTableRowsDeleted(selectedRow, selectedRow);
    }
   
    Parking getParking(int selectedRow) {
        return parkings.get(selectedRow);
    }
    

}
