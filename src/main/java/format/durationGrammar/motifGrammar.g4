grammar motifGrammar;
main: linearMotif EOF;

linearMotif : linearMotifDuration
            | linearMotifPitch
            | linearMotifPitchMove
            ;

linearMotifDuration : '(' duration+ ')';
linearMotifPitch : '(' pitch+ ')';
linearMotifPitchMove : '(' pitchMove+ ')';

// pitch
//-----------------------------------------------------------------------------------------------------

pitch : absolutePitch
      | relativePitch
      | simplePitch;


absolutePitch : pitchName '.' octaveNumber ;
relativePitch : pitchName '.' octaveModifier ;
simplePitch : pitchName;

pitchName : 'a' | 'aes' | 'ais'
      | 'b' | 'bes' | 'bis'
      | 'c' | 'ces' | 'cis'
      | 'd' | 'des' | 'dis'
      | 'e' | 'ees' | 'eis'
      | 'f' | 'fes' | 'fis'
      | 'g'| 'ges' | 'gis' | 'r' ;

octaveNumber : 'o0' | 'o1' | 'o2' | 'o3' | 'o4' | 'o5' | 'o6' | 'o7';
octaveModifier : 'o+' | 'o++' | 'o-' | 'o--';

// pitch Move
//-------------------------------------------------------------------------------------------------------------

pitchMove : 'm' pitchMoveNumber;
pitchMoveNumber : '-7' | '-6' | '-5' | '-4' | '-3' | '-2' | '-1' | '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' ;

// duration
//--------------------------------------------------------------------------------------------------------------

duration : simpleDuration
         | compoundDuration
         ;
compoundDuration : '[' simpleDuration+ ']';
simpleDuration : '1' | '2' | '4' | '8' | '16' | '32' | '64' ;


/*  Lexical rules */
// ----------------------------------------------------------------------------------------------------

ID : [a-zA-Z][a-zA-Z]+;  // Identifiers
WS : [ \r\n\t]+ -> skip;    // Separators