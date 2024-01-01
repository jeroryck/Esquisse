grammar motifGrammar;
main: linearMotif EOF;

linearMotif : linearMotifDuration
            | linearMotifPitch
            ;

linearMotifDuration : '(' duration+ ')';
linearMotifPitch : '(' pitch+ ')';

// Elementary Components
//-----------------------------------------------------------------------------------------------------

pitch : '[' pitchName octaveNumber ']';

pitchName : 'a' | 'aes' | 'ais'
      | 'b' | 'bes' | 'bis'
      | 'c' | 'ces' | 'cis'
      | 'd' | 'des' | 'dis'
      | 'e' | 'ees' | 'eis'
      | 'f' | 'fes' | 'fis'
      | 'g'| 'ges' | 'gis' | 'r' ;

duration : simpleDuration
         | compoundDuration
         ;

compoundDuration : '[' simpleDuration+ ']';


simpleDuration : '1' | '2' | '4' | '8' | '16' | '32' | '64' ;
octaveNumber : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7';

/*  Lexical rules */
// ----------------------------------------------------------------------------------------------------

ID : [a-zA-Z][a-zA-Z]+;  // Identifiers
WS : [ \r\n\t]+ -> skip;    // Separators