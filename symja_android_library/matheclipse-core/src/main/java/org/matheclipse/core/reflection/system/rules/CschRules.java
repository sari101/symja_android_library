package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface CschRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 15, 0 };

  final public static IAST RULES = List(
    IInit(Csch, SIZES),
    // Csch(0)=ComplexInfinity
    ISet(Csch(C0),
      CComplexInfinity),
    // Csch(1/6*Pi*I)=(-2)*I
    ISet(Csch(Times(CC(0L,1L,1L,6L),Pi)),
      CC(0L,1L,-2L,1L)),
    // Csch(1/4*Pi*I)=-Sqrt(2)*I
    ISet(Csch(Times(CC(0L,1L,1L,4L),Pi)),
      Times(CNI,CSqrt2)),
    // Csch(1/2*Pi*I)=-I
    ISet(Csch(Times(CC(0L,1L,1L,2L),Pi)),
      CNI),
    // Csch(3/4*Pi*I)=-Sqrt(2)*I
    ISet(Csch(Times(CC(0L,1L,3L,4L),Pi)),
      Times(CNI,CSqrt2)),
    // Csch(5/6*Pi*I)=(-2)*I
    ISet(Csch(Times(CC(0L,1L,5L,6L),Pi)),
      CC(0L,1L,-2L,1L)),
    // Csch(Pi*I)=ComplexInfinity
    ISet(Csch(Times(CI,Pi)),
      CComplexInfinity),
    // Csch(7/6*Pi*I)=2*I
    ISet(Csch(Times(CC(0L,1L,7L,6L),Pi)),
      CC(0L,1L,2L,1L)),
    // Csch(5/4*Pi*I)=Sqrt(2)*I
    ISet(Csch(Times(CC(0L,1L,5L,4L),Pi)),
      Times(CI,CSqrt2)),
    // Csch(3/2*Pi*I)=I
    ISet(Csch(Times(CC(0L,1L,3L,2L),Pi)),
      CI),
    // Csch(7/4*Pi*I)=Sqrt(2)*I
    ISet(Csch(Times(CC(0L,1L,7L,4L),Pi)),
      Times(CI,CSqrt2)),
    // Csch(11/6*Pi*I)=2*I
    ISet(Csch(Times(CC(0L,1L,11L,6L),Pi)),
      CC(0L,1L,2L,1L)),
    // Csch(2*Pi*I)=ComplexInfinity
    ISet(Csch(Times(CC(0L,1L,2L,1L),Pi)),
      CComplexInfinity),
    // Csch(Infinity)=0
    ISet(Csch(oo),
      C0),
    // Csch(ComplexInfinity)=Indeterminate
    ISet(Csch(CComplexInfinity),
      Indeterminate)
  );
}
