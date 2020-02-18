# USE CASE: 4 Produce a Report on the top n capital cities in the world.

## CHARACTERISTIC INFORMATION

### Goal in Context

As the user i want to be able to make a report of the top N populated capital cities in the world, where N is provided by the me, so that i can check most populated capitals.

### Scope

Organisation

### Level

Primary task.

### Preconditions

The capital cities and respective fields are already present in the database

### Success End Condition

A report is available for the organization.

### Failed End Condition

No report is produced.

### Primary Actor

Organisation.

### Trigger

A request for the top n capital cities in the world.

## MAIN SUCCESS SCENARIO

1. Need of retrieving the top n capital cities in the world, where n is provided by the user.
2. The user queries the database selecting the above option and giving n as input.
3. A report from the database is given back to the organization.

## EXTENSIONS

2. **Database missing specific data**:
    1. Organisation troubleshoots with IT to ensure the database is actually missing the data. 
    
## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 3.0