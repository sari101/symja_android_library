package org.matheclipse.core.reflection.system;

import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.generic.IsBinaryFalse;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.list.algorithms.EvaluationSupport;

public class Sort extends AbstractFunctionEvaluator {

	public Sort() {
	}

	@Override
	public IExpr evaluate(final IAST ast) {
		Validate.checkRange(ast, 2, 3);

		if (ast.arg1().isAST()) {
			final IAST shallowCopy = ((IAST) ast.arg1()).clone();
			if (shallowCopy.size() <= 2) {
				return shallowCopy;
			}
			try {
				if (ast.size() == 2) {
					EvaluationSupport.sort(shallowCopy);
				} else {
					// use the 2nd argument as a head for the comparator operation:
					EvaluationSupport.sort(shallowCopy, new IsBinaryFalse<IExpr>(ast.arg2()));
				}
				return shallowCopy;
			} catch (Exception ex) {

			}
		}

		return null;
	}
}
