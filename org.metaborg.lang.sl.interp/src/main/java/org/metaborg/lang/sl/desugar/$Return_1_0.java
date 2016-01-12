package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Return_1_0 extends Strategy 
{ 
  public static $Return_1_0 instance = new $Return_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Return_1_0");
    Fail51:
    { 
      IStrategoTerm p_74 = null;
      IStrategoTerm o_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consReturn_1 != ((IStrategoAppl)term).getConstructor())
        break Fail51;
      o_74 = term.getSubterm(0);
      IStrategoList annos28 = term.getAnnotations();
      p_74 = annos28;
      term = t_6.invoke(context, o_74);
      if(term == null)
        break Fail51;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consReturn_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_74));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}