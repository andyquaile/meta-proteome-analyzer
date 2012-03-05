package de.mpa.client.ui;


import de.mpa.io.MascotGenericFile;

public class Constants {
	public static final int MAINFRAME_WIDTH = 1280;
	public static final int MAINFRAME_HEIGHT = 800;
	public static final String[] FASTA_DB = {"uniprot_sprot", "ecoli"};
	public static final String[] ENZYMES = {"Trypsin", "Semi-tryptic"};
	
	// TODO: consolidate Thilo's and Robert's possibly redundant constants?
	public static final String[] DN_FASTA_DB = {"NCBI", "uniprot_sprot"};
	public static final String[] DN_ENZYMES = {"Trypsin", "Semi-tryptic"};
	public static final String[] PTMS = {"Oxidation (M)",
		 								 "Carbamidomethyl (C)"};
	public static final String[] MASS_SPECTROMETERS = {"ESI-TRAP (LTQ)", "MALDI-ToF/ToF", "QSTAR"};

	// Title of the application
	public final static String APPTITLE = "MetaProteomicsAnalyzer";
	
	// Version number
	public final static String VER_NUMBER = "0.3";
	
	public final static String SELECTED_ROW_HTML_FONT_COLOR = "#FFFFFF";
	public final static String NOT_SELECTED_ROW_HTML_FONT_COLOR = "#0101DF";

	public static final String[]  DNBLAST_DB = {"Uniprot_sprot","NCBI"};
	
	public static final MascotGenericFile EMPTY_MGF = new MascotGenericFile("empty", ("BEGIN IONS\n" +
																					  "0.0\t999.0\n" +
																					  "90.909\t0.0\n" +
																					  "END IONS"));

}
