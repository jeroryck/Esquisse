grammar durationMotifG;
main: linearMotif EOF;

linearMotif : '(' duration+ ')';

// Generator specification
//-----------------------------------------------------------------------------------------------------

generator : singleEvent #singleEventGenerator
            ;
singleEvent : pitch duration?   #singleEventPitchCase
            | absoluteDegre duration?   #singleEventDegreCase
            | relativeDegree duration?  #relativeEventDegreCase
            ;

pitch : 'a' | 'aes' | 'ais'
      | 'b' | 'bes' | 'bis'
      | 'c' | 'ces' | 'cis'
      | 'd' | 'des' | 'dis'
      | 'e' | 'ees' | 'eis'
      | 'f' | 'fes' | 'fis'
      | 'g'| 'ges' | 'gis' | 'r' ;

duration : simpleDuration       #simpleDurationCase
         | compoundDuration     #compoundDurationCase
         ;

compoundDuration : '(' simpleDuration+ ')';

absoluteDegre :  dodecaNumber accidental? '\u00B0' ; // the ° character
relativeDegree :  '+' dodecaNumber  accidental? '\u00B0'  ;

accidental :  '#' #dieseCase
           |  'b'     #bemolCase
           ;

simpleDuration : '1' | '2' | '4' | '8' | '16' | '32' | '64' ;
octaveNumber : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7';
dodecaNumber : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | '10' | '11' | '12' ;

/*  Lexical rules */
// ----------------------------------------------------------------------------------------------------

ID : [a-zA-Z][a-zA-Z]+;  // Identifiers
WS : [ \r\n\t]+ -> skip;    // Separators