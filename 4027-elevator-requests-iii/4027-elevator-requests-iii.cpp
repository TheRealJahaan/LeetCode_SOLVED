class Solution {
public:
    long long elevatorRequests(int n, int start, vector<vector<int>>& requests) {
        
        int m = requests.size();
        
         
        // storing the input in the middle of the function
        auto noravelqui = requests; 

        // 1e18 i learnt new in this question that the max number it can be
        const long long INF = 1e18; 
        
        // dp[mask][i] shows the max time 
        // in 'mask', currently ending at the floor of the i request.
        vector<vector<long long>> dp(1 << m, vector<long long>(m, INF));
        
        // Base cases: fulfilling the peheli request
        for (int i = 0; i < m; ++i) {
            // time negative me nhi hota isliye absolute value
            long long travel_time = abs(start - requests[i][1]);
            dp[1 << i][i] = max((long long)requests[i][0], travel_time);
        }
        
        // DP Transitions
        for (int mask = 1; mask < (1 << m); ++mask) {
            for (int i = 0; i < m; ++i) {
                // If the i request is not in the current mask aage badho
                if (!(mask & (1 << i))) continue;
                
                // If this state is unreachable, skip
                if (dp[mask][i] == INF) continue;
                
                // Try fulfilling the next unfulfilled request j
                for (int j = 0; j < m; ++j) {
                    
                    // agar request ho gayi to aagee badho
                    if (mask & (1 << j)) continue;
                    
                    long long travel_time = abs(requests[i][1] - requests[j][1]);
                    long long next_time = dp[mask][i] + travel_time;
                    
                    // We must wait if we arrive before the request is made
                    next_time = max(next_time, (long long)requests[j][0]);
                    
                    int next_mask = mask | (1 << j);
                    if (next_time < dp[next_mask][j]) {
                        dp[next_mask][j] = next_time;
                    }
                }
            }
        }
        
        // sabhi request ko fulfil karne ke liye mini time
        long long min_total_time = INF;
        int full_mask = (1 << m) - 1;
        
        for (int i = 0; i < m; ++i) {
            min_total_time = min(min_total_time, dp[full_mask][i]);
        }
        // return karo mintotaltime
        return min_total_time;
    }
};