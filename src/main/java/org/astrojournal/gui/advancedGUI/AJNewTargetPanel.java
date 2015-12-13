/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.astrojournal.gui.advancedGUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author npdp
 */
public class AJNewTargetPanel extends javax.swing.JPanel {

    /**
     * Creates new form AJNewTargetPanel
     */
    public AJNewTargetPanel() {
	initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed"
    // desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

	tabPaneNewReport = new JPanel();
	labDate = new JLabel();
	labTime = new JLabel();
	labLocation = new JLabel();
	labAltitude = new JLabel();
	labTemperature = new JLabel();
	labSeeing = new JLabel();
	labTransparency = new JLabel();
	txtdate = new JTextField();
	txttime = new JTextField();
	txtlocation = new JTextField();
	txtaltitude = new JTextField();
	txttemperature = new JTextField();
	labTelescopes = new JLabel();
	labEyepieces = new JLabel();
	labFilters = new JLabel();
	jScrollPane1 = new JScrollPane();
	txttelescopes = new JTextArea();
	jScrollPane2 = new JScrollPane();
	txteyepieces = new JTextArea();
	jScrollPane3 = new JScrollPane();
	txtfilters = new JTextArea();
	jScrollPane5 = new JScrollPane();
	tblobservation = new JTable();
	btnAddTarget = new JButton();
	btnRemoveTarget = new JButton();
	btnSubmitReport = new JButton();
	cbxtransparency = new JComboBox();
	cbxseeing = new JComboBox();
	jLabel1 = new JLabel();
	txttime1 = new JTextField();
	filler2 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0),
		new Dimension(32767, 0));

	ResourceBundle bundle = ResourceBundle.getBundle("locale/Bundle"); // NOI18N
	tabPaneNewReport.setToolTipText(bundle
		.getString("AJNewTargetPanel.tabPaneNewReport.toolTipText")); // NOI18N
	tabPaneNewReport.setAutoscrolls(true);

	labDate.setText(bundle.getString("AJNewTargetPanel.labDate.text")); // NOI18N

	labTime.setText(bundle.getString("AJNewTargetPanel.labTime.text")); // NOI18N

	labLocation.setText(bundle
		.getString("AJNewTargetPanel.labLocation.text")); // NOI18N

	labAltitude.setText(bundle
		.getString("AJNewTargetPanel.labAltitude.text")); // NOI18N

	labTemperature.setText(bundle
		.getString("AJNewTargetPanel.labTemperature.text")); // NOI18N

	labSeeing.setText(bundle.getString("AJNewTargetPanel.labSeeing.text")); // NOI18N

	labTransparency.setText(bundle
		.getString("AJNewTargetPanel.labTransparency.text")); // NOI18N

	txtdate.setToolTipText(bundle
		.getString("AJNewTargetPanel.txtdate.toolTipText")); // NOI18N

	txttime.setToolTipText(bundle
		.getString("AJNewTargetPanel.txttime.toolTipText")); // NOI18N

	txtlocation.setToolTipText(bundle
		.getString("AJNewTargetPanel.txtlocation.toolTipText")); // NOI18N
	txtlocation.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent evt) {
		txtlocationActionPerformed(evt);
	    }
	});

	txtaltitude.setToolTipText(bundle
		.getString("AJNewTargetPanel.txtaltitude.toolTipText")); // NOI18N

	txttemperature.setToolTipText(bundle
		.getString("AJNewTargetPanel.txttemperature.toolTipText")); // NOI18N

	labTelescopes.setText(bundle
		.getString("AJNewTargetPanel.labTelescopes.text")); // NOI18N

	labEyepieces.setText(bundle
		.getString("AJNewTargetPanel.labEyepieces.text")); // NOI18N

	labFilters
		.setText(bundle.getString("AJNewTargetPanel.labFilters.text")); // NOI18N

	txttelescopes.setColumns(20);
	txttelescopes.setLineWrap(true);
	txttelescopes.setRows(5);
	txttelescopes.setToolTipText(bundle
		.getString("AJNewTargetPanel.txttelescopes.toolTipText")); // NOI18N
	txttelescopes.setWrapStyleWord(true);
	jScrollPane1.setViewportView(txttelescopes);

	txteyepieces.setColumns(20);
	txteyepieces.setLineWrap(true);
	txteyepieces.setRows(5);
	txteyepieces.setToolTipText(bundle
		.getString("AJNewTargetPanel.txteyepieces.toolTipText")); // NOI18N
	txteyepieces.setWrapStyleWord(true);
	jScrollPane2.setViewportView(txteyepieces);

	txtfilters.setColumns(20);
	txtfilters.setLineWrap(true);
	txtfilters.setRows(5);
	txtfilters.setToolTipText(bundle
		.getString("AJNewTargetPanel.txtfilters.toolTipText")); // NOI18N
	txtfilters.setWrapStyleWord(true);
	jScrollPane3.setViewportView(txtfilters);

	tblobservation.setModel(new DefaultTableModel(new Object[][] { { null,
		null, null, null, null } }, new String[] { "Target",
		"Constellation", "Type", "Power", "Notes" }) {
	    Class[] types = new Class[] { String.class, String.class,
		    String.class, String.class, String.class };

	    @Override
	    public Class getColumnClass(int columnIndex) {
		return types[columnIndex];
	    }
	});
	tblobservation.setColumnSelectionAllowed(true);
	jScrollPane5.setViewportView(tblobservation);

	btnAddTarget.setText(bundle
		.getString("AJNewTargetPanel.btnAddTarget.text")); // NOI18N
	btnAddTarget.setToolTipText(bundle
		.getString("AJNewTargetPanel.btnAddTarget.toolTipText")); // NOI18N
	btnAddTarget.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent evt) {
		btnAddTargetActionPerformed(evt);
	    }
	});

	btnRemoveTarget.setText(bundle
		.getString("AJNewTargetPanel.btnRemoveTarget.text")); // NOI18N
	btnRemoveTarget.setToolTipText(bundle
		.getString("AJNewTargetPanel.btnRemoveTarget.toolTipText")); // NOI18N
	btnRemoveTarget.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent evt) {
		btnRemoveTargetActionPerformed(evt);
	    }
	});

	btnSubmitReport.setText(bundle
		.getString("AJNewTargetPanel.btnSubmitReport.text")); // NOI18N
	btnSubmitReport.setToolTipText(bundle
		.getString("AJNewTargetPanel.btnSubmitReport.toolTipText")); // NOI18N
	btnSubmitReport.setEnabled(false);
	btnSubmitReport.setFocusable(false);
	btnSubmitReport.setHorizontalTextPosition(SwingConstants.CENTER);
	btnSubmitReport.setVerticalTextPosition(SwingConstants.BOTTOM);

	cbxtransparency.setEditable(true);
	cbxtransparency.setModel(new DefaultComboBoxModel(new String[] {
		"1 - Do not observe", "2 - Very poor", "3 - Poor",
		"4 - Somewhat clear", "5 - Partly clear", "6 - Clear",
		"7 - Very clear", "8 - Extremely clear" }));
	cbxtransparency.setSelectedIndex(5);
	cbxtransparency.setToolTipText(bundle
		.getString("AJNewTargetPanel.cbxtransparency.toolTipText")); // NOI18N
	cbxtransparency.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent evt) {
		cbxtransparencyActionPerformed(evt);
	    }
	});

	cbxseeing.setEditable(true);
	cbxseeing.setModel(new DefaultComboBoxModel(
		new String[] { "1 - Perfect seeing",
			"2 - Slightly undulations", "3 - Moderate seeing",
			"4 - Poor seeing", "5 - Very bad seeing" }));
	cbxseeing.setSelectedIndex(1);
	cbxseeing.setToolTipText(bundle
		.getString("AJNewTargetPanel.cbxseeing.toolTipText")); // NOI18N
	cbxseeing.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent evt) {
		cbxseeingActionPerformed(evt);
	    }
	});

	jLabel1.setText(bundle.getString("AJNewTargetPanel.jLabel1.text")); // NOI18N

	txttime1.setToolTipText(bundle
		.getString("AJNewTargetPanel.txttime1.toolTipText")); // NOI18N

	GroupLayout tabPaneNewReportLayout = new GroupLayout(tabPaneNewReport);
	tabPaneNewReport.setLayout(tabPaneNewReportLayout);
	tabPaneNewReportLayout
		.setHorizontalGroup(tabPaneNewReportLayout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(
				tabPaneNewReportLayout
					.createSequentialGroup()
					.addContainerGap()
					.addGroup(
						tabPaneNewReportLayout
							.createParallelGroup(
								GroupLayout.Alignment.LEADING)
							.addComponent(
								jScrollPane5)
							.addGroup(
								GroupLayout.Alignment.TRAILING,
								tabPaneNewReportLayout
									.createSequentialGroup()
									.addComponent(
										btnAddTarget)
									.addGap(9,
										9,
										9)
									.addComponent(
										btnRemoveTarget)
									.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED,
										GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
									.addComponent(
										btnSubmitReport))
							.addGroup(
								tabPaneNewReportLayout
									.createSequentialGroup()
									.addGroup(
										tabPaneNewReportLayout
											.createParallelGroup(
												GroupLayout.Alignment.LEADING)
											.addGroup(
												tabPaneNewReportLayout
													.createSequentialGroup()
													.addGroup(
														tabPaneNewReportLayout
															.createParallelGroup(
																GroupLayout.Alignment.LEADING)
															.addGroup(
																GroupLayout.Alignment.TRAILING,
																tabPaneNewReportLayout
																	.createSequentialGroup()
																	.addComponent(
																		labSeeing)
																	.addGap(67,
																		67,
																		67))
															.addGroup(
																tabPaneNewReportLayout
																	.createSequentialGroup()
																	.addComponent(
																		labTransparency)
																	.addGap(19,
																		19,
																		19)))
													.addGroup(
														tabPaneNewReportLayout
															.createParallelGroup(
																GroupLayout.Alignment.TRAILING,
																false)
															.addComponent(
																cbxtransparency,
																0,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
															.addComponent(
																cbxseeing,
																0,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)))
											.addGroup(
												tabPaneNewReportLayout
													.createSequentialGroup()
													.addGroup(
														tabPaneNewReportLayout
															.createParallelGroup(
																GroupLayout.Alignment.LEADING)
															.addComponent(
																labDate)
															.addComponent(
																labTime)
															.addComponent(
																labLocation)
															.addComponent(
																labAltitude)
															.addComponent(
																labTemperature))
													.addGap(24,
														24,
														24)
													.addGroup(
														tabPaneNewReportLayout
															.createParallelGroup(
																GroupLayout.Alignment.TRAILING,
																false)
															.addGroup(
																tabPaneNewReportLayout
																	.createSequentialGroup()
																	.addComponent(
																		txttime,
																		GroupLayout.PREFERRED_SIZE,
																		72,
																		GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(
																		LayoutStyle.ComponentPlacement.RELATED)
																	.addComponent(
																		jLabel1,
																		GroupLayout.PREFERRED_SIZE,
																		5,
																		GroupLayout.PREFERRED_SIZE)
																	.addGap(10,
																		10,
																		10)
																	.addComponent(
																		txttime1,
																		GroupLayout.PREFERRED_SIZE,
																		72,
																		GroupLayout.PREFERRED_SIZE))
															.addComponent(
																txtlocation,
																GroupLayout.Alignment.LEADING)
															.addComponent(
																txtaltitude,
																GroupLayout.Alignment.LEADING)
															.addComponent(
																txttemperature,
																GroupLayout.Alignment.LEADING)
															.addComponent(
																txtdate))))
									.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED,
										GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
									.addComponent(
										filler2,
										GroupLayout.PREFERRED_SIZE,
										24,
										GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(
										tabPaneNewReportLayout
											.createParallelGroup(
												GroupLayout.Alignment.LEADING)
											.addComponent(
												labTelescopes)
											.addComponent(
												labEyepieces)
											.addComponent(
												labFilters))
									.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(
										tabPaneNewReportLayout
											.createParallelGroup(
												GroupLayout.Alignment.TRAILING,
												false)
											.addComponent(
												jScrollPane1,
												GroupLayout.DEFAULT_SIZE,
												388,
												Short.MAX_VALUE)
											.addComponent(
												jScrollPane2)
											.addComponent(
												jScrollPane3))))
					.addContainerGap()));
	tabPaneNewReportLayout
		.setVerticalGroup(tabPaneNewReportLayout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(
				tabPaneNewReportLayout
					.createSequentialGroup()
					.addContainerGap()
					.addGroup(
						tabPaneNewReportLayout
							.createParallelGroup(
								GroupLayout.Alignment.LEADING)
							.addGroup(
								tabPaneNewReportLayout
									.createSequentialGroup()
									.addComponent(
										filler2,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
									.addGap(21,
										21,
										21))
							.addGroup(
								tabPaneNewReportLayout
									.createSequentialGroup()
									.addGroup(
										tabPaneNewReportLayout
											.createParallelGroup(
												GroupLayout.Alignment.LEADING)
											.addGroup(
												tabPaneNewReportLayout
													.createSequentialGroup()
													.addGroup(
														tabPaneNewReportLayout
															.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
															.addComponent(
																labDate)
															.addComponent(
																txtdate,
																GroupLayout.PREFERRED_SIZE,
																19,
																GroupLayout.PREFERRED_SIZE))
													.addPreferredGap(
														LayoutStyle.ComponentPlacement.RELATED)
													.addGroup(
														tabPaneNewReportLayout
															.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
															.addComponent(
																labTime)
															.addComponent(
																txttime,
																GroupLayout.PREFERRED_SIZE,
																19,
																GroupLayout.PREFERRED_SIZE)
															.addComponent(
																jLabel1)
															.addComponent(
																txttime1,
																GroupLayout.PREFERRED_SIZE,
																19,
																GroupLayout.PREFERRED_SIZE)))
											.addComponent(
												labTelescopes)
											.addComponent(
												jScrollPane1,
												GroupLayout.PREFERRED_SIZE,
												0,
												Short.MAX_VALUE))
									.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(
										tabPaneNewReportLayout
											.createParallelGroup(
												GroupLayout.Alignment.LEADING)
											.addComponent(
												labEyepieces)
											.addGroup(
												tabPaneNewReportLayout
													.createSequentialGroup()
													.addGroup(
														tabPaneNewReportLayout
															.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
															.addComponent(
																labLocation)
															.addComponent(
																txtlocation,
																GroupLayout.PREFERRED_SIZE,
																19,
																GroupLayout.PREFERRED_SIZE))
													.addPreferredGap(
														LayoutStyle.ComponentPlacement.RELATED)
													.addGroup(
														tabPaneNewReportLayout
															.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
															.addComponent(
																labAltitude)
															.addComponent(
																txtaltitude,
																GroupLayout.PREFERRED_SIZE,
																19,
																GroupLayout.PREFERRED_SIZE)))
											.addComponent(
												jScrollPane2,
												GroupLayout.PREFERRED_SIZE,
												0,
												Short.MAX_VALUE))
									.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(
										tabPaneNewReportLayout
											.createParallelGroup(
												GroupLayout.Alignment.LEADING)
											.addComponent(
												labFilters)
											.addGroup(
												tabPaneNewReportLayout
													.createSequentialGroup()
													.addComponent(
														jScrollPane3,
														GroupLayout.PREFERRED_SIZE,
														44,
														GroupLayout.PREFERRED_SIZE)
													.addGap(9,
														9,
														9)
													.addGroup(
														tabPaneNewReportLayout
															.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
															.addComponent(
																labTransparency)
															.addComponent(
																cbxtransparency,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)))
											.addGroup(
												tabPaneNewReportLayout
													.createSequentialGroup()
													.addGroup(
														tabPaneNewReportLayout
															.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
															.addComponent(
																labTemperature)
															.addComponent(
																txttemperature,
																GroupLayout.PREFERRED_SIZE,
																19,
																GroupLayout.PREFERRED_SIZE))
													.addPreferredGap(
														LayoutStyle.ComponentPlacement.RELATED)
													.addGroup(
														tabPaneNewReportLayout
															.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
															.addComponent(
																cbxseeing,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
															.addComponent(
																labSeeing))))
									.addGap(18,
										18,
										Short.MAX_VALUE)))
					.addComponent(jScrollPane5,
						GroupLayout.DEFAULT_SIZE, 309,
						Short.MAX_VALUE)
					.addPreferredGap(
						LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(
						tabPaneNewReportLayout
							.createParallelGroup(
								GroupLayout.Alignment.LEADING)
							.addComponent(
								btnSubmitReport,
								GroupLayout.Alignment.TRAILING,
								GroupLayout.PREFERRED_SIZE,
								25,
								GroupLayout.PREFERRED_SIZE)
							.addGroup(
								tabPaneNewReportLayout
									.createParallelGroup(
										GroupLayout.Alignment.BASELINE)
									.addComponent(
										btnRemoveTarget)
									.addComponent(
										btnAddTarget)))
					.addContainerGap()));

	GroupLayout layout = new GroupLayout(this);
	this.setLayout(layout);
	layout.setHorizontalGroup(layout
		.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGap(0, 864, Short.MAX_VALUE)
		.addGroup(
			layout.createParallelGroup(
				GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
					.addGap(0, 0, Short.MAX_VALUE)
					.addComponent(tabPaneNewReport,
						GroupLayout.DEFAULT_SIZE,
						GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
					.addGap(0, 0, Short.MAX_VALUE))));
	layout.setVerticalGroup(layout
		.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGap(0, 565, Short.MAX_VALUE)
		.addGroup(
			layout.createParallelGroup(
				GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
					.addGap(0, 0, Short.MAX_VALUE)
					.addComponent(tabPaneNewReport,
						GroupLayout.DEFAULT_SIZE,
						GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
					.addGap(0, 0, Short.MAX_VALUE))));
    }// </editor-fold>//GEN-END:initComponents

    private void txtlocationActionPerformed(ActionEvent evt) {// GEN-FIRST:event_txtlocationActionPerformed
	// TODO add your handling code here:
    }// GEN-LAST:event_txtlocationActionPerformed

    private void btnAddTargetActionPerformed(ActionEvent evt) {// GEN-FIRST:event_btnAddTargetActionPerformed
	// TODO add your handling code here:
    }// GEN-LAST:event_btnAddTargetActionPerformed

    private void btnRemoveTargetActionPerformed(ActionEvent evt) {// GEN-FIRST:event_btnRemoveTargetActionPerformed
	// TODO add your handling code here:
    }// GEN-LAST:event_btnRemoveTargetActionPerformed

    private void cbxtransparencyActionPerformed(ActionEvent evt) {// GEN-FIRST:event_cbxtransparencyActionPerformed
	// TODO add your handling code here:
    }// GEN-LAST:event_cbxtransparencyActionPerformed

    private void cbxseeingActionPerformed(ActionEvent evt) {// GEN-FIRST:event_cbxseeingActionPerformed
	// TODO add your handling code here:
    }// GEN-LAST:event_cbxseeingActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnAddTarget;
    private JButton btnRemoveTarget;
    private JButton btnSubmitReport;
    private JComboBox cbxseeing;
    private JComboBox cbxtransparency;
    private Box.Filler filler2;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane5;
    private JLabel labAltitude;
    private JLabel labDate;
    private JLabel labEyepieces;
    private JLabel labFilters;
    private JLabel labLocation;
    private JLabel labSeeing;
    private JLabel labTelescopes;
    private JLabel labTemperature;
    private JLabel labTime;
    private JLabel labTransparency;
    private JPanel tabPaneNewReport;
    private JTable tblobservation;
    private JTextField txtaltitude;
    private JTextField txtdate;
    private JTextArea txteyepieces;
    private JTextArea txtfilters;
    private JTextField txtlocation;
    private JTextArea txttelescopes;
    private JTextField txttemperature;
    private JTextField txttime;
    private JTextField txttime1;
    // End of variables declaration//GEN-END:variables
}
