/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CustomerPanel;

import java.awt.HeadlessException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarDetailsList;

/**
 *
 * @author shreya
 */
public class MainCustomerPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainCustomerPanel
     */
    private JPanel workPanel;
    private CarDetailsList carDetailsList;

    private static final String MODEL = "Model Name";
    private static final String SERIAL_NUMBER = "Serial Number";
    private static final String SEATS = "Seats";
    private static final String MANUFACTURER = "Manufacturer";
    private static final String MANUFACTURE_YEAR = "Manufacture Year";
    private static final String LOCATION = "Available Car by City";
    private static final String AVAILABILITY = "All available cars";
    private static final String MAINTENANCE_CERTIFICATE = "Expired Maintenance Certificate";

    List<Car> newCarList;

    public MainCustomerPanel(JPanel workPanel, CarDetailsList carDetailsList) {
        initComponents();
        this.workPanel = workPanel;
        this.carDetailsList = carDetailsList;

        populateTable(carDetailsList.getCarDetailsList());
        txtFleetUpdate.setText(String.valueOf(carDetailsList.getLastFleetUpdate()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAvailableCar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFleetUpdate = new javax.swing.JTextField();
        dropdownSearch = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        txtSearchInputField = new javax.swing.JTextField();
        lblSeatSearch = new javax.swing.JLabel();
        txtSeatInputField1 = new javax.swing.JTextField();
        txtSeatInputField2 = new javax.swing.JTextField();
        btnSeatSearch = new javax.swing.JButton();
        btnManufacturers = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Customer");

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Model ", "Serial No", "Manufacturer", "Manufacture Year", "Seats", "Location", "Available Car", "Maintanence Certificate"
            }
        ));
        jTable1.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jTable1);

        btnAvailableCar.setBackground(new java.awt.Color(255, 255, 255));
        btnAvailableCar.setText("First Available Car");
        btnAvailableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableCarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Last Update :");

        txtFleetUpdate.setEditable(false);
        txtFleetUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFleetUpdateActionPerformed(evt);
            }
        });

        dropdownSearch.setBackground(new java.awt.Color(255, 255, 255));
        dropdownSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Model", "Serial Number", "Manufacturer", "Manufacture Year", "Location", "All Available Car", "All Unavailabe Car", "Maintanance Certificate Expired" }));
        dropdownSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownSearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSearch.setText("Search :");

        txtSearchInputField.setText("type here...");
        txtSearchInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchInputFieldActionPerformed(evt);
            }
        });

        lblSeatSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSeatSearch.setText("Search by Seats :");

        txtSeatInputField1.setText("minSeats");

        txtSeatInputField2.setText("maxSeats");

        btnSeatSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSeatSearch.setText("Search");
        btnSeatSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeatSearchActionPerformed(evt);
            }
        });

        btnManufacturers.setBackground(new java.awt.Color(255, 255, 255));
        btnManufacturers.setText("All Manufacturers");
        btnManufacturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufacturersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFleetUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSearch)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSeatSearch)
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dropdownSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtSeatInputField1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSeatInputField2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSeatSearch)
                            .addComponent(btnSearch))
                        .addGap(257, 257, 257))))
            .addGroup(layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAvailableCar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManufacturers, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFleetUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropdownSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(lblSearch))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSeatInputField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSeatInputField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeatSearch)
                    .addComponent(lblSeatSearch))
                .addGap(43, 43, 43)
                .addComponent(btnManufacturers)
                .addGap(33, 33, 33)
                .addComponent(btnAvailableCar)
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFleetUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFleetUpdateActionPerformed
        // TODO add your handling code here:
        carDetailsList.setLastFleetUpdate(LocalDateTime.now());
        txtFleetUpdate.setText(String.valueOf(carDetailsList.getLastFleetUpdate()));
        
        
    }//GEN-LAST:event_txtFleetUpdateActionPerformed

    private void btnAvailableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableCarActionPerformed
        // TODO add your handling code here: 
        ArrayList<Car> firstCarList = new ArrayList<Car>();
        for (Car car : carDetailsList.getCarDetailsList()) {
            if (car.isAvailability()) {
                firstCarList.add(car);
            }
            break;
        }
        populateTable(firstCarList);
    }//GEN-LAST:event_btnAvailableCarActionPerformed

    private void dropdownSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropdownSearchActionPerformed
    
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        int dropdownIndex = dropdownSearch.getSelectedIndex();
        String model = null;
        String serial_number = null;
        String manufacturer = null;
        String location = null;
        boolean availability = true;
        boolean certificate_expired = true;
        
        

        switch (dropdownIndex) {
            case 0:                
                try{
                    model = txtSearchInputField.getText();
                ArrayList<Car> modelNumberList = new ArrayList<Car>();
                for (Car car : carDetailsList.getCarDetailsList()) {
                    if (car.getModelnumber().equals(model)) {
                        modelNumberList.add(car);
                       }
                }
                if(modelNumberList.isEmpty()){
                    JOptionPane.showMessageDialog(this, "No entry for selected Model Name");
                }
                populateTable(modelNumberList);
                
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Invalid Model Input");
                }
                break;

            case 1: try{
                    serial_number = txtSearchInputField.getText();
                ArrayList<Car> serialNumberList = new ArrayList<Car>();
                for (Car car : carDetailsList.getCarDetailsList()) {
                    if (car.getSerialnumber().contains(serial_number)) {
                        serialNumberList.add(car);
                       }
                }
                if(serialNumberList.isEmpty()){
                    JOptionPane.showMessageDialog(this, "No entry for selected Serial Number");
                }
                populateTable(serialNumberList);
                
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Invalid Serial Number Input");
                }
                break;

            case 2: try{
                    manufacturer = txtSearchInputField.getText();
                ArrayList<Car> manufacturerList = new ArrayList<Car>();
                for (Car car : carDetailsList.getCarDetailsList()) {
                    if (car.getManufacturer().contains(manufacturer)) {
                        manufacturerList.add(car);
                       }
                }
                if(manufacturerList.isEmpty()){
                    JOptionPane.showMessageDialog(this, "No entry for selected Manufacturer Name");
                }
                populateTable(manufacturerList);
                
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Invalid Manufacturer Input");
                }
                break;

            case 3: try{
                    int manufacture_year = Integer.parseInt(txtSearchInputField.getText());
                    
                ArrayList<Car> manufactureYearList = new ArrayList<Car>();
                for (Car car : carDetailsList.getCarDetailsList()) {
                    if (car.getManufactureyear()==manufacture_year) {
                        manufactureYearList.add(car);
                       }
                }
                if(manufactureYearList.isEmpty()){
                    JOptionPane.showMessageDialog(this, "No entry for selected Manufacture Year");
                }
                populateTable(manufactureYearList);
                
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(this, "No car for given Year");
                }
                break;
                
            case 4: try{
                    location = txtSearchInputField.getText();
                    
                ArrayList<Car> locationList = new ArrayList<Car>();
                for (Car car : carDetailsList.getCarDetailsList()) {
                    if (car.getLocation().equals(location)) {
                        locationList.add(car);
                       }
                }
                if(locationList.isEmpty()){
                    JOptionPane.showMessageDialog(this, "No car at selected Location");
                }
                populateTable(locationList);
                
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(this, "No cars at this Location");
                }
                break;
                
                case 5:  try{                
                    int availableCounter = 0;
                    ArrayList<Car> availableList = new ArrayList<>();
                    for (Car car : carDetailsList.getCarDetailsList()) {
                        if (car.isAvailability()== true) {
                            availableList.add(car);
                            availableCounter = availableCounter +1;
                           }
                    }
                    txtSearchInputField.setText(String.valueOf(availableCounter));
                    if(availableList.isEmpty()){
                    JOptionPane.showMessageDialog(this, "No cars Available");
                }
                    populateTable(availableList);
                
                }
                catch(HeadlessException e){
                    JOptionPane.showMessageDialog(this, "No cars found");
                }
                break;

                
                case 6: try{                
                    int unavailableCounter = 0;
                    ArrayList<Car> unavailableList = new ArrayList<>();
                    for (Car car : carDetailsList.getCarDetailsList()) {
                        if (car.isAvailability()== false) {
                            unavailableList.add(car);
                            unavailableCounter = unavailableCounter +1;
                           }
                    }
                    txtSearchInputField.setText(String.valueOf(unavailableCounter));
                    if(unavailableList.isEmpty()){
                    JOptionPane.showMessageDialog(this, "No cars Available");
                }
                    populateTable(unavailableList);
                
                }
                catch(HeadlessException e){
                    JOptionPane.showMessageDialog(this, "No cars found");
                }
                break;
                
                case 7: 
                    try{                
                    int expiredCounter = 0;
                    ArrayList<Car> certificateExpiredList = new ArrayList<>();
                    for (Car car : carDetailsList.getCarDetailsList()) {
                        if (car.isMaintanancecertificate()==false) {
                            certificateExpiredList.add(car);
                            expiredCounter = expiredCounter +1;
                           }
                    }
                    txtSearchInputField.setText(String.valueOf(expiredCounter));
                    if(certificateExpiredList.isEmpty()){
                    JOptionPane.showMessageDialog(this, "No cars with expired certificate");
                }
                    populateTable(certificateExpiredList);
                
                }
                catch(HeadlessException e){
                    JOptionPane.showMessageDialog(this, "Invalid Input");
                }
                break;


        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSeatSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeatSearchActionPerformed
        // TODO add your handling code here:
        
        int minSeats = Integer.parseInt(txtSeatInputField1.getText());
        int maxSeats = Integer.parseInt(txtSeatInputField2.getText());      
        try{             
            ArrayList<Car> seatsList = new ArrayList<>();
            for (Car car : carDetailsList.getCarDetailsList()) {
                if (minSeats <= car.getSeats() && maxSeats >= car.getSeats())  {
                    System.out.println(minSeats);
                    seatsList.add(car);
                   }
            }
            if(seatsList.isEmpty()){
            JOptionPane.showMessageDialog(this, "No cars found");
        }
            populateTable(seatsList);

        }
        catch(HeadlessException e){
            JOptionPane.showMessageDialog(this, "Invalid Input");
        }
                
        
        
       
        
        
    }//GEN-LAST:event_btnSeatSearchActionPerformed

    private void btnManufacturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManufacturersActionPerformed
        // TODO add your handling code here:
        Set<String> manufacturers = new HashSet<String>();
        for(Car car: carDetailsList.getCarDetailsList()){
            manufacturers.add(car.getManufacturer());
        }
        JOptionPane.showMessageDialog(this, "List of all Manufacturers: " + manufacturers);
        
    }//GEN-LAST:event_btnManufacturersActionPerformed

    private void txtSearchInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchInputFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvailableCar;
    private javax.swing.JButton btnManufacturers;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSeatSearch;
    private javax.swing.JComboBox<String> dropdownSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblSeatSearch;
    private javax.swing.JTextField txtFleetUpdate;
    private javax.swing.JTextField txtSearchInputField;
    private javax.swing.JTextField txtSeatInputField1;
    private javax.swing.JTextField txtSeatInputField2;
    // End of variables declaration//GEN-END:variables

    private void populateTable(ArrayList<Car> carDetailsList) {
        DefaultTableModel customerTable = (DefaultTableModel) jTable1.getModel();
        customerTable.setRowCount(0);

        for (Car car : carDetailsList) {
            Object[] row = new Object[customerTable.getColumnCount()];

            row[0] = car.getModelnumber();
            row[1] = car.getSerialnumber();
            row[2] = car.getManufacturer();
            row[3] = car.getManufactureyear();
            row[4] = car.getSeats();
            row[5] = car.getLocation();
            row[6] = car.isAvailability();
            row[7] = car.isMaintanancecertificate();

            customerTable.addRow(row);

        }
    }
}
