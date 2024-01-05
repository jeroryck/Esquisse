grammar motifGrammar;


main: motif EOF;

motif  : linearMotif
       | seriesMotif
       | orMotif
       | loopMotif;

seriesMotif : '(' motif+ ')';
orMotif : '(' 'OR' motif+ ')';
loopMotif : '(' 'LOOP' loopNumber motif ')';
loopNumber : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
            | INTEGER;

linearMotif : linearMotifDuration
            | linearMotifPitch
            | linearMotifMove
            ;

linearMotifDuration : '(' durationSpec+ ')';
linearMotifPitch : '(' pitch+ ')';
linearMotifMove : '(' move+ ')';

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

//  Move
//-------------------------------------------------------------------------------------------------------------

move : 'm' moveNumber;
moveNumber : '-7' | '-6' | '-5' | '-4' | '-3' | '-2' | '-1' | '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' ;

// duration
//--------------------------------------------------------------------------------------------------------------

durationSpec : duration mute?;
duration : simpleDuration
         | compoundDuration
         ;
compoundDuration : '[' simpleDuration+ ']';
simpleDuration : '1' | '2' | '4' | '8' | '16' | '32' | '64' ;
mute : 'mute';

/*  Lexical rules */
// ----------------------------------------------------------------------------------------------------

ID : [a-zA-Z][a-zA-Z]+;  // Identifiers
WS : [ \r\n\t]+ -> skip;    // Separators
INTEGER : [0-9]+;