package ca.ubc.cs.beta.smac.executors.stub;

import ca.ubc.cs.beta.aclib.configspace.ParamConfiguration;
import ca.ubc.cs.beta.aclib.configspace.ParamConfigurationSpace;

public class TestMain {

	public static void main(String[] args)
	{
		
		String arg = "sp-clause-activity-inc='1', sp-clause-decay='1.4', sp-clause-del-heur='2', sp-clause-inversion='1', sp-first-restart='100', sp-learned-clause-sort-heur='0', sp-learned-clauses-inc='1.3', sp-learned-size-factor='0.4', sp-max-res-lit-inc='1', sp-max-res-runs='4', sp-orig-clause-sort-heur='0', sp-phase-dec-heur='5', sp-rand-phase-dec-freq='0.001', sp-rand-phase-scaling='1', sp-rand-var-dec-freq='0.001', sp-rand-var-dec-scaling='1', sp-res-cutoff-cls='8', sp-res-cutoff-lits='400', sp-res-order-heur='0', sp-resolution='1', sp-restart-inc='1.5', sp-update-dec-queue='1', sp-use-pure-literal-rule='1', sp-var-activity-inc='1', sp-var-dec-heur='0', sp-variable-decay='1.4'";
		
		ParamConfigurationSpace p = new ParamConfigurationSpace("/ubc/cs/home/s/seramage/arrowspace/sm/sample_inputs/spear-params.txt");
		
		p.getConfigurationFromString(arg, ParamConfiguration.StringFormat.NODB_SYNTAX);
	}
}
