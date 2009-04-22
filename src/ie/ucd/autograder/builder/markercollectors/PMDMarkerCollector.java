package ie.ucd.autograder.builder.markercollectors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PMDMarkerCollector extends MarkerCollector {

  //Taken from the PMD eclipse plugin.xml file
  //http://pmd.svn.sourceforge.net/viewvc/pmd/trunk/pmd-eclipse-plugin/plugins/net.sourceforge.pmd.eclipse.plugin/plugin.xml
  public static final String PMD_MARKER = "net.sourceforge.pmd.eclipse.plugin.pmdMarker";
  public static final String PMD_TASK_MARKER = "net.sourceforge.pmd.eclipse.plugin.pmdTaskMarker";
  public static final String PMD_DFA_MARKER = "net.sourceforge.pmd.eclipse.plugin.pmdDFAMarker";
  
  private static final List<String> types = new ArrayList<String>(3);
  static {
    types.add(PMD_MARKER);
//    Not sure what the below two are for...
    types.add(PMD_TASK_MARKER);
    types.add(PMD_DFA_MARKER);
  }
  
  @Override
  public Collection<String> getTypes() {
    return types;
  }

}