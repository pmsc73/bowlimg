Bowlimg project repo

The Game is played on a __Board__ which should be procedurally generated based on some algorithm

The __Board__ contains __Tiles__ which are simply hexagonal pieces which have a *owner* and a number of *units*

Turn order and shit:
  Each turn involves every player making their moves simultaneously. This begins with each player reinforcing their currently owned territories by adding a number of units (which is based on territories owned) to them.
  Then the players choose to move their units to attack adjacent territories. The battles are then carried out, with casualties removed, and the last man standing in each territory will own it.
