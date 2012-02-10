package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Chars_1_0 extends Strategy 
{ 
  public static $Chars_1_0 instance = new $Chars_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Chars_1_0");
    Fail182:
    { 
      IStrategoTerm e_132 = null;
      IStrategoTerm d_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consChars_1 != ((IStrategoAppl)term).getConstructor())
        break Fail182;
      d_132 = term.getSubterm(0);
      IStrategoList annos157 = term.getAnnotations();
      e_132 = annos157;
      term = t_25.invoke(context, d_132);
      if(term == null)
        break Fail182;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consChars_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}