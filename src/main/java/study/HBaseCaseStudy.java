package study;

import arcatch.ArCatchAPI;
import arcatch.dsl.compartment.grammar.Compartment;
import arcatch.dsl.rule.common.Criticality;


public class HBaseCaseStudy {
	
	private static Compartment hbase;	

	public static void main(String[] args) {		
		
		//https://github.com/apache/hbase/tree/master/hbase-common	
		String projetPath = "./HBase/";		
		
		//https://github.com/apache/hbase/releases/tag/rel%2F2.2.3
		checkHBase223(projetPath + "HBase_2.2.3/hbase-common/src/main/java");
		
		//https://github.com/apache/hbase/releases/tag/rel%2F2.2.0
		checkHBase220(projetPath + "HBase_2.2.0/hbase-common/src/main/java");
		
		//https://github.com/apache/hbase/releases/tag/rel%2F2.1.0
		checkHBase210(projetPath + "HBase_2.1.0/hbase-common/src/main/java");		
		
		//https://github.com/apache/hbase/releases/tag/rel%2F2.0.0
		checkHBase200(projetPath + "HBase_2.0.0/hbase-common/src/main/java");
		
		//https://github.com/apache/hbase/releases/tag/rel%2F1.5.0
		checkHBase150(projetPath + "HBase_1.5.0/hbase-common/src/main/java");
		
		//https://github.com/apache/hbase/releases/tag/rel%2F1.4.0
		checkHBase140(projetPath + "HBase_1.4.0/hbase-common/src/main/java");
		
		//https://github.com/apache/hbase/releases/tag/rel%2F1.3.0
		checkHBase130(projetPath + "HBase_1.3.0/hbase-common/src/main/java");
		
		//https://github.com/apache/hbase/releases/tag/rel%2F1.2.0
		checkHBase120(projetPath + "HBase_1.2.0/hbase-common/src/main/java");
		
		//https://github.com/apache/hbase/releases/tag/rel%2F1.1.0
		checkHBase110(projetPath + "HBase_1.1.0/hbase-common/src/main/java");
		
		//https://github.com/apache/hbase/releases/tag/rel%2F1.0.0
		checkHBase100(projetPath + "HBase_1.0.0/hbase-common/src/main/java");	
		
	}

	private static void checkRules() {		
			
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("NoCA = 0.0")
				.build());	
		
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("NoCI = 0.0")
				.build());
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("NoCRN = 0.0")
				.build());		
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("NoEH = 0.0")
				.build());
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("NoDR = 0.0")
				.build());				
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("NoGH = 0.0")
				.build());
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("NoGS = 0.0")
				.build());
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("NoNPB = 0.0")
				.build());
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("NoOCA = 0.0")
				.build());		
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("NoOC = 0.0")
				.build());
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("NoSF = 0.0")
				.build());
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("NoSKS = 0.0")
				.build());						
		
		// Abstractness violation
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("(Ce / (Ce + Ca)) <= 0.3")
				.build());
		
		//Large Class according PMD tool: https://github.com/pmd/pmd/blob/master/pmd-java/src/main/java/net/sourceforge/pmd/lang/java/rule/design/DataClassRule.java
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("(((NoM + NoA) > 3) & (WMC < 31)) | (((NoM + NoA) > 5) & (WMC < 47))")
				.build());
				
		//TooManyFields according PMD tool: ttps://github.com/pmd/pmd/blob/master/pmd-java/src/main/java/net/sourceforge/pmd/lang/java/rule/design/TooManyFieldsRule.java
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("NoA > 15")
				.build());		
		
		//TooManyMethods according PMD tool: https://pmd.github.io/pmd-6.19.0/pmd_rules_java_design.html#toomanymethods
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(hbase)
				.constrainedTo("NoM > 10")
				.build());		
		
		ArCatchAPI.check();
	}
	
	private static void checkHBase220(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("HBase", "2.2.0")
				.projectPath(projectPath)				
				.build());
		
		hbase = ArCatchAPI
				.compartmentBuilder()
				.compartment("hbase")
				.matching("org.apache.hadoop.hbase.*")
				.build();

		ArCatchAPI.addCompartment(hbase);		
		
		checkRules();
	}

	private static void checkHBase210(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("HBase", "2.1.0")
				.projectPath(projectPath)				
				.build());
		
		hbase = ArCatchAPI
				.compartmentBuilder()
				.compartment("hbase")
				.matching("org.apache.hadoop.hbase.*")
				.build();

		ArCatchAPI.addCompartment(hbase);		
		
		checkRules();
	}

	private static void checkHBase200(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("HBase", "2.0.0")
				.projectPath(projectPath)				
				.build());
		
		hbase = ArCatchAPI
				.compartmentBuilder()
				.compartment("hbase")
				.matching("org.apache.hadoop.hbase.*")
				.build();

		ArCatchAPI.addCompartment(hbase);		
		
		checkRules();
	}

	private static void checkHBase160(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("HBase", "1.6.0")
				.projectPath(projectPath)				
				.build());
		
		hbase = ArCatchAPI
				.compartmentBuilder()
				.compartment("hbase")
				.matching("org.apache.hadoop.hbase.*")
				.build();

		ArCatchAPI.addCompartment(hbase);		
		
		checkRules();
	}

	private static void checkHBase150(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("HBase", "1.5.0")
				.projectPath(projectPath)				
				.build());
		
		hbase = ArCatchAPI
				.compartmentBuilder()
				.compartment("hbase")
				.matching("org.apache.hadoop.hbase.*")
				.build();

		ArCatchAPI.addCompartment(hbase);		
		
		checkRules();
	}

	private static void checkHBase140(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("HBase", "1.4.0")
				.projectPath(projectPath)				
				.build());
		
		hbase = ArCatchAPI
				.compartmentBuilder()
				.compartment("hbase")
				.matching("org.apache.hadoop.hbase.*")
				.build();

		ArCatchAPI.addCompartment(hbase);		
		
		checkRules();
	}

	private static void checkHBase130(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("HBase", "1.3.0")
				.projectPath(projectPath)				
				.build());
		
		hbase = ArCatchAPI
				.compartmentBuilder()
				.compartment("hbase")
				.matching("org.apache.hadoop.hbase.*")
				.build();

		ArCatchAPI.addCompartment(hbase);		
		
		checkRules();
	}

	private static void checkHBase120(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("HBase", "1.2.0")
				.projectPath(projectPath)				
				.build());
		
		hbase = ArCatchAPI
				.compartmentBuilder()
				.compartment("hbase")
				.matching("org.apache.hadoop.hbase.*")
				.build();

		ArCatchAPI.addCompartment(hbase);		
		
		checkRules();
	}

	private static void checkHBase110(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("HBase", "1.1.0")
				.projectPath(projectPath)				
				.build());
		
		hbase = ArCatchAPI
				.compartmentBuilder()
				.compartment("hbase")
				.matching("org.apache.hadoop.hbase.*")
				.build();

		ArCatchAPI.addCompartment(hbase);		
		
		checkRules();
	}

	private static void checkHBase100(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("HBase", "1.0.0")
				.projectPath(projectPath)				
				.build());
		
		hbase = ArCatchAPI
				.compartmentBuilder()
				.compartment("hbase")
				.matching("org.apache.hadoop.hbase.*")
				.build();

		ArCatchAPI.addCompartment(hbase);		
		
		checkRules();
	}
	
	private static void checkHBase223(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("HBase", "2.2.3")
				.projectPath(projectPath)				
				.build());
		
		hbase = ArCatchAPI
				.compartmentBuilder()
				.compartment("hbase")
				.matching("org.apache.hadoop.hbase.*")
				.build();

		ArCatchAPI.addCompartment(hbase);		
		
		checkRules();
	}
}
